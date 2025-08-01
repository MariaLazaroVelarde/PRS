package pe.edu.vallegrande.ms_distribution.domain.models;

import lombok.*;
import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "user")
public class User {

    @Id
    private String responsibleUserId;
    private String name;
    private String email;
    private String password;
    private String status = "ACTIVE";
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt;

}
