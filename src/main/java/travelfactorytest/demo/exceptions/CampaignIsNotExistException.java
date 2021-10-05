package travelfactorytest.demo.exceptions;

public class CampaignIsNotExistException extends RuntimeException{
    public CampaignIsNotExistException() {
        super();
    }

    public CampaignIsNotExistException(String message) {
        super(message);
    }

    public CampaignIsNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public CampaignIsNotExistException(Throwable cause) {
        super(cause);
    }
}
