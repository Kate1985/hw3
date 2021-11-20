package pro.sky.java.course1.lesson9;

import java.util.Objects;

public class Author {
        private final String authorFirstName;
        private final String authorLastName;

        public Author(String authorFirstName, String authorLastName) {
            this.authorFirstName = authorFirstName;
            this.authorLastName = authorLastName;
        }

        public String getAuthorFirstName() {
            return authorFirstName;
        }

        public String getAuthorLastName() {
            return authorLastName;
        }

        @Override
        public String toString() {
            return "Author{" +
                    "authorFirstName='" + authorFirstName + '\'' +
                    ", authorLastName='" + authorLastName + '\'' +
                    '}';
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorFirstName.equals(author.authorFirstName) && authorLastName.equals(author.authorLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorFirstName, authorLastName);
    }
}


