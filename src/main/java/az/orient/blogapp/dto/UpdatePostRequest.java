package az.orient.blogapp.dto;

import az.orient.blogapp.entity.PostStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdatePostRequest {
    private UUID id;
    private String title;
    private String content;
    private UUID categoryId;
    @Builder.Default
    private Set<UUID> tagIds = new HashSet<>();
    private PostStatus status;
}
