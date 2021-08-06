package com.translate.deeplapp.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeeplTranslationDto {
    @JsonProperty("detected_source_language")
    private String detectedSourceLang;

    @JsonProperty("text")
    private int translatedText;

}
