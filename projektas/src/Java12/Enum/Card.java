package Java12.Enum;

public enum Card {
    VISA(new String[]{"4"}),
    MASTERCARD(new String[]{"51", "52", "53", "54", "55"});

    private String[] startsWith;

    Card(String[] startsWith) {
        this.startsWith = startsWith;
    }

    public boolean isCorrectType(String cardnumber) {
        if (cardnumber == null || cardnumber.length() == 0) {

            return false;
        }
        String cardNumberWithoutSpace = cardnumber.replaceAll(" ", "");
        if (cardNumberWithoutSpace.length() != 16) {
            return false;
        }
        for (int i = 0; i < startsWith.length; i++) {
            if (cardNumberWithoutSpace.startsWith(startsWith[i])) {
                return true;

            }


        }
        return false;

    }
}
