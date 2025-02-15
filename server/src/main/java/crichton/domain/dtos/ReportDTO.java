package crichton.domain.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;

public class ReportDTO {

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class DataResponse {
        private HashMap<String,String> project;
        private List<HashMap<String,String>> file;
        private List<HashMap<String,String>> unit;
    }

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class DataRequest {
        @Schema(description = "테스트할 소스코드 경로", required = true)
        private String sourcePath;
    }


}
