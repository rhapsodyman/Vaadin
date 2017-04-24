package com.rhapsoyman.grid.converter;

import java.util.Locale;

import com.vaadin.data.Converter;
import com.vaadin.data.Result;
import com.vaadin.data.ValueContext;
import com.vaadin.server.FontAwesome;

public class BooleanToFontIconConverter implements Converter<String, Boolean> {

  /*  public Boolean convertToModel(String value,
            Class<? extends Boolean> targetType, Locale locale)
            throws ConversionException {
        throw new ConversionException("Not supported");
    }

    public String convertToPresentation(Boolean value,
            Class<? extends String> targetType, Locale locale)
            throws com.vaadin.data.util.converter.Converter.ConversionException {
        if (Boolean.TRUE.equals(value)) {
            return FontAwesome.CHECK_SQUARE_O.getHtml();
        } else {
            return FontAwesome.SQUARE_O.getHtml();
        }
    }*/

	@Override
	public Result<Boolean> convertToModel(String value, ValueContext context) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String convertToPresentation(Boolean value, ValueContext context) {
		if (Boolean.TRUE.equals(value)) {
            return FontAwesome.CHECK_SQUARE_O.getHtml();
        } else {
            return FontAwesome.SQUARE_O.getHtml();
        }
	}

   

}