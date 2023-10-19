package lesson9;

import java.util.Objects;

public class User {
    private String username;
    private String pathToImage;

    public User() {
    }

    public User(String username, String pathToImage) {
        this.username = username;
        this.pathToImage = pathToImage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPathToImage() {
        return pathToImage;
    }

    public void setPathToImage(String pathToImage) {
        this.pathToImage = pathToImage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(pathToImage, user.pathToImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, pathToImage);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", pathToImage='" + pathToImage + '\'' +
                '}';
    }
}
