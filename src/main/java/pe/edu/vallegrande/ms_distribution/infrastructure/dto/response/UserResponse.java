package pe.edu.vallegrande.ms_distribution.infrastructure.dto.response;

import lombok.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

    private String responsibleUserId;
    private String name;
    private String email;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
