import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.impl.FacebookTemplate;

import java.util.ArrayList;
import java.util.List;

public class Main {

	private static final String accessToken = "CAACEdEose0cBAF3gZBstlS1hpIoahjH1Rso05560pcNR5ZA6IRY5bBous1u14tpcIxnu77CZC0TOugnBOadrv8BZCbLnS2EC8tL8cxnq2GX9j8QiZAfPc1grzN3ZBKGXp7R8gZCc7lbjm7AOMuHRNSTWt13skXzK9HDv84ZAfQZCvptMWgZBIonI2ZBCZC7u2RE0kUZCQxLgKuqw1NZAgivmx5vOvN";

public static void main(String[] args){

    Facebook facebook = new FacebookTemplate(accessToken, "myApp");

    Integer nrOfFriends = facebook.friendOperations().getFriends().getTotalCount();

    List<String> friends = new ArrayList<>();

    for(int i=0; i < 8; i++){
        friends.add(facebook.friendOperations().getFriends().get(i).getName());
    }

    System.out.println(friends);

	}

}