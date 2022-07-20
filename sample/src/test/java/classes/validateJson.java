package classes;

import org.testng.annotations.Test;
import io.restassured.path.json.JsonPath;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.*;


public class validateJson extends Baseclass {
	

	//  Validate team  has only 4 foreign players
    @Test
    public void validate_no_of_Foreign_Players() {

        JsonPath j = new JsonPath(resp.asString());
        int total_players = j.getInt("player.size()");
        int Foreign_players = 0;
        System.out.println("Total no of players: "+total_players);

        for (int i = 0; i < total_players; i++) {
            String country = j.getString("player.country[" + i + "]");
            if (!(country.equals("India")))
            	Foreign_players++;
        }

        System.out.println("Total no of Foreign Players are: " + Foreign_players);
        assertThat(Foreign_players, equalTo(4));
        System.out.println("Validated:Team has only 4 foreign players");
    }


    //   validate there is atleast one wicket keeper
    @Test
    public void no_of_wicket_keeper() {
        JsonPath j = new JsonPath(resp.asString());

        int total_players = j.getInt("player.size()");
        int wicket_keepers = 0;
        for (int i = 0; i < total_players; i++) {

            String role = j.getString("player.role[" + i + "]");

            if (role.equals("Wicket-keeper"))
            	wicket_keepers++;

        }
        System.out.println("\n\nTotal no of wicket-Keepers : "+wicket_keepers);
        assertThat(wicket_keepers,greaterThanOrEqualTo(1));
        System.out.println("Validated:Team  has atleast one Wicket-Keeper");

    }
	
}
