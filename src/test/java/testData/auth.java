package testData;

public class auth {

    public pojo.auth authPayload(){

        pojo.auth ap = new pojo.auth();
        ap.setUsername("admin");
        ap.setPassword("password123");

        return ap;

    }

}
