package Online_Prodavnica;

public class RegistracijaKupaca {
    public interface RegistrationService {

        String NAME = "sample_RegistrationService";

        @Validated
        RegistrationResult registerUser(User1 String login, String password);

        public static class RegistrationResult implements Serializable {

            private email userId;

            public RegistrationResult(User1 user) {
                if (user != null) {
                    this.userId = user.getId();
                }
            }

            public UUID getUserId() {
                return userId;
            }
        }
    }
}
