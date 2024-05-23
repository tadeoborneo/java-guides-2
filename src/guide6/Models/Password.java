package guide6.Models;

import java.security.SecureRandom;
import java.util.Objects;

public class Password {
    private String password;
    private Integer length = 8;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Password password1)) return false;
        return Objects.equals(getPassword(), password1.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getPassword());
    }

    @Override
    public String toString() {
        return "Password{" +
                "password='" + password + '\'' +
                '}';
    }

    public Password(Integer length) {
        if (length < 0)
            throw new IllegalArgumentException("La longitud no puede ser negativa");
        this.length = length;
        this.password = this.generatePassword();
    }

    public Password(String password) {
        this.password = password;
        this.length = password.length();
    }

    public Password() {
        this.password = generatePassword();
    }

    public void setLength(Integer length) {
        if (length < 0)
            throw new IllegalArgumentException("La longitud no puede ser negativa");
        this.length = length;
    }

    public String getPassword() {
        return password;
    }

    public Integer getLength() {
        return length;
    }

    public String generatePassword() {
        final String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < this.length; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }

    public Boolean isStrong() {
        if (this.moreThan2Upper() && moreThan1Lower() && moreThan5Numbers())
            return true;
        return false;
    }

    private Boolean moreThan2Upper() {
        int upperCount = 0;
        for (int i = 0; i < this.length; i++) {
            if (Character.isUpperCase(this.password.charAt(i)))
                upperCount++;
            if (upperCount > 2)
                return true;
        }
        return false;
    }

    private Boolean moreThan1Lower() {
        int lowerCount = 0;
        for (Character c : this.password.toCharArray()) {
            if (Character.isLowerCase(c))
                lowerCount++;
            if (lowerCount > 1)
                return true;
        }
        return false;
    }

    private Boolean moreThan5Numbers() {
        int numberCount = 0;
        for (Character c : this.password.toCharArray()) {
            if (Character.isDigit(c))
                numberCount++;
            if (numberCount > 5)
                return true;
        }
        return false;
    }

    public Boolean compareTo(String password) {
        if (this.password.equals(password))
            return true;
        else
            return false;
    }


}
