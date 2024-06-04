import jakarta.persistence.*;

@Entity
public class Image {

    @Id
    @GeneratedValue
    int id;

    String fileName;

    String fileData;

    @ManyToOne(fetch = FetchType.LAZY)
    Recipe associatedRecipie;

    public Image(String fileName, String fileData, Recipe associatedRecipie) {
        this.fileName = fileName;
        this.fileData = fileData;
        this.associatedRecipie = associatedRecipie;
    }
}

