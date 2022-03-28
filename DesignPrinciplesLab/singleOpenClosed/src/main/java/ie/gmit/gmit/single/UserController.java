package ie.gmit.single;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class UserController {

    //Handles incoming JSON requests that work on User resource/entity

        //Store used by controller
      private UserPersistenceService persistenceService = new UserPersistenceService();
        //Create a new user
        public String createUser(String userJson) throws IOException {
            ObjectMapper mapper = new ObjectMapper();

            User user = mapper.readValue(userJson, User.class);

            ValidateUser myUser = new ValidateUser();
            boolean checkedUser = myUser.checkUser(user);
            if(!checkedUser) {
                return "ERROR";
            }

            persistenceService.saveUser(user);

            return "SUCCESS";
        }





 }

