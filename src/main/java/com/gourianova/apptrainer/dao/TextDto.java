package com.gourianova.apptrainer.dao;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class TextDto implements Serializable {

    private String text;
}
