package com.redashwood.tinyuserservice.mapper;

import com.redashwood.tinyuserservice.dto.TinyUserDTO;
import com.redashwood.tinyuserservice.entity.TinyUserDocument;
import com.redashwood.tinyuserservice.exception.TinyExceptionEnum;
import com.redashwood.tinyuserservice.exception.TinyServerException;

public class TInyUserDocumentMapper {

    public static TinyUserDocument toTinyUserDocument(TinyUserDTO tinyUserDTO) {

        if (null == tinyUserDTO) {
            throw new TinyServerException(TinyExceptionEnum.ERROR001, "Exception occurred while mapping TinyUserDTO to TinyUserDocument");
        }

        return null;
    }
}
