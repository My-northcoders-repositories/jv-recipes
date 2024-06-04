import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Image {

    @Id
    @GeneratedValue
    int id;

    String fileName;

    String fileData;

    @ManyToMany
    Recipe associatedRecipie;

    public Image(String fileName, String fileData, Recipe associatedRecipie) {
        this.fileName = fileName;
        this.fileData = fileData;
        this.associatedRecipie = associatedRecipie;
    }
}

