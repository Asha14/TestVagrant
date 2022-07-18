package classes;

import org.testng.annotations.Test;
import io.restassured.path.json.JsonPath;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.*;


public class validateJson extends Baseclass {
	

	//  Validate team  has only 4 foreign players
    @Test
    public void validateJson_1() {

        JsonPath j = new JsonPath(resp.asString());
        int count = j.getInt("player.size()");
        int players = 0;
        System.out.println("Total no of players: "+count);

        for (int i = 0; i < count; i++) {
            String country = j.getString("player.country[" + i + "]");
            if (!(country.equals("India")))
                players++;
        }

        System.out.println("Total no of Foreign Players are: " + players);
        assertThat(players, equalTo(4));
        System.out.println("Validated:Team has only 4 foreign players");
    }


    //   validate there is atleast  one wicket keeper
    @Test
    public void wicket_keeper() {
        JsonPath j = new JsonPath(resp.asString());

        int count = j.getInt("player.size()");
        int players = 0;
        for (int i = 0; i < count; i++) {

            String role = j.getString("player.role[" + i + "]");

            if (role.equals("Wicket-keeper"))
                players++;

        }
        System.out.println("\n\nTotal no of wicket-Keepers : "+players);
        assertThat(players,greaterThanOrEqualTo(1));
        System.out.println("Validated:Team  has atleast one Wicket-Keeper");

    }
	
}
