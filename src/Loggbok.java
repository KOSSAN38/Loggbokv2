/**
 * skapar creator och body här.
 */
public class Loggbok {

    private String Creator;
    private String body;

    public String getCreator() {
        return Creator;
    }

    public void setCreator(String creator) {
        Creator = creator;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Loggbok(String Creator, String body) {
        this.Creator = Creator;
        this.body = body;
    }
}