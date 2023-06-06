package Switch;

public class SwitchChallenge {
    public static void main(String[] args) {
        char challengeText = 'A';
        char challengeText2 = 'B';
        char challengeText3 = 'C';
        char challengeText4 = 'D';
        char challengeText5 = 'Z';
        System.out.println(challengeText + " = " + switchChallenge(challengeText));
        System.out.println(challengeText2 + " = " + switchChallenge(challengeText2));
        System.out.println(challengeText3 + " = " + switchChallenge(challengeText3));
        System.out.println(challengeText4 + " = " + switchChallenge(challengeText4));
        System.out.println(challengeText5 + " = " + switchChallenge(challengeText5));
    }
    public static String switchChallenge( char letter){
        String defaultAnswer = "";
        switch( letter){
                case 'A' :
                    return defaultAnswer = "Able";
                case 'B' :
                    return defaultAnswer = "Baker";
                case 'C' :
                    return defaultAnswer = "Charlie";
                case 'D' :
                    return defaultAnswer = "Dog";
                case 'E' :
                    return defaultAnswer = "Easy";
            default:
                return defaultAnswer = letter + " letter not found";

         }
    }
}
