package morning_practice.saims_recent_practices.amazon;

public class UseAmazon {
    public static void main(String[] args) {
        AmazonAccount obj = new AmazonAccount("alexasky", "alexasky@gmail.com",true);
        System.out.println(obj);
        obj.setEmail("cgochak@gmail.com");
        System.out.println(obj.getEmail());

    }
}
