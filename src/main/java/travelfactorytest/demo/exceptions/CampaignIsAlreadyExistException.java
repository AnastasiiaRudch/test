package travelfactorytest.demo.exceptions;

public class CampaignIsAlreadyExistException extends RuntimeException{

    public CampaignIsAlreadyExistException() {
        super();
    }

    public CampaignIsAlreadyExistException(String message) {
        super(message);
    }

    public CampaignIsAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public CampaignIsAlreadyExistException(Throwable cause) {
        super(cause);
    }
}
