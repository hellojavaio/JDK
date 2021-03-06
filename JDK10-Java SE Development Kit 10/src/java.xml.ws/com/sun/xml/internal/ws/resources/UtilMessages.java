/*
 * Copyright (c) 1997, 2017, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package com.sun.xml.internal.ws.resources;

import java.util.Locale;
import java.util.ResourceBundle;
import javax.annotation.Generated;
import com.sun.istack.internal.localization.Localizable;
import com.sun.istack.internal.localization.LocalizableMessageFactory;
import com.sun.istack.internal.localization.LocalizableMessageFactory.ResourceBundleSupplier;
import com.sun.istack.internal.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 *
 */
@Generated("com.sun.istack.internal.maven.ResourceGenMojo")
public final class UtilMessages {

    private final static String BUNDLE_NAME = "com.sun.xml.internal.ws.resources.util";
    private final static LocalizableMessageFactory MESSAGE_FACTORY = new LocalizableMessageFactory(BUNDLE_NAME, new UtilMessages.BundleSupplier());
    private final static Localizer LOCALIZER = new Localizer();

    public static Localizable localizableUTIL_HANDLER_CANNOT_COMBINE_SOAPMESSAGEHANDLERS() {
        return MESSAGE_FACTORY.getMessage("util.handler.cannot.combine.soapmessagehandlers");
    }

    /**
     * You must use HanlderChain annotation, not SOAPMessageHandlers
     *
     */
    public static String UTIL_HANDLER_CANNOT_COMBINE_SOAPMESSAGEHANDLERS() {
        return LOCALIZER.localize(localizableUTIL_HANDLER_CANNOT_COMBINE_SOAPMESSAGEHANDLERS());
    }

    public static Localizable localizableUTIL_LOCATION(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("util.location", arg0, arg1);
    }

    /**
     * at line {0} of {1}
     *
     */
    public static String UTIL_LOCATION(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableUTIL_LOCATION(arg0, arg1));
    }

    public static Localizable localizableUTIL_HANDLER_CLASS_NOT_FOUND(Object arg0) {
        return MESSAGE_FACTORY.getMessage("util.handler.class.not.found", arg0);
    }

    /**
     * "Class: {0} could not be found"
     *
     */
    public static String UTIL_HANDLER_CLASS_NOT_FOUND(Object arg0) {
        return LOCALIZER.localize(localizableUTIL_HANDLER_CLASS_NOT_FOUND(arg0));
    }

    public static Localizable localizableUTIL_HANDLER_NO_WEBSERVICE_ANNOTATION(Object arg0) {
        return MESSAGE_FACTORY.getMessage("util.handler.no.webservice.annotation", arg0);
    }

    /**
     * "A WebService annotation is not present on class: {0}"
     *
     */
    public static String UTIL_HANDLER_NO_WEBSERVICE_ANNOTATION(Object arg0) {
        return LOCALIZER.localize(localizableUTIL_HANDLER_NO_WEBSERVICE_ANNOTATION(arg0));
    }

    public static Localizable localizableUTIL_HANDLER_ENDPOINT_INTERFACE_NO_WEBSERVICE(Object arg0) {
        return MESSAGE_FACTORY.getMessage("util.handler.endpoint.interface.no.webservice", arg0);
    }

    /**
     * "The Endpoint Interface: {0} does not have WebService Annotation"
     *
     */
    public static String UTIL_HANDLER_ENDPOINT_INTERFACE_NO_WEBSERVICE(Object arg0) {
        return LOCALIZER.localize(localizableUTIL_HANDLER_ENDPOINT_INTERFACE_NO_WEBSERVICE(arg0));
    }

    public static Localizable localizableUTIL_PARSER_WRONG_ELEMENT(Object arg0, Object arg1, Object arg2) {
        return MESSAGE_FACTORY.getMessage("util.parser.wrong.element", arg0, arg1, arg2);
    }

    /**
     * found element "{1}", expected "{2}" in handler chain configuration (line {0})
     *
     */
    public static String UTIL_PARSER_WRONG_ELEMENT(Object arg0, Object arg1, Object arg2) {
        return LOCALIZER.localize(localizableUTIL_PARSER_WRONG_ELEMENT(arg0, arg1, arg2));
    }

    public static Localizable localizableUTIL_FAILED_TO_PARSE_HANDLERCHAIN_FILE(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("util.failed.to.parse.handlerchain.file", arg0, arg1);
    }

    /**
     * Could not parse handler chain file {1} for class {0}
     *
     */
    public static String UTIL_FAILED_TO_PARSE_HANDLERCHAIN_FILE(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableUTIL_FAILED_TO_PARSE_HANDLERCHAIN_FILE(arg0, arg1));
    }

    public static Localizable localizableUTIL_FAILED_TO_FIND_HANDLERCHAIN_FILE(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("util.failed.to.find.handlerchain.file", arg0, arg1);
    }

    /**
     * Could not find handler chain file {1} for class {0}
     *
     */
    public static String UTIL_FAILED_TO_FIND_HANDLERCHAIN_FILE(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableUTIL_FAILED_TO_FIND_HANDLERCHAIN_FILE(arg0, arg1));
    }

    private static class BundleSupplier
        implements ResourceBundleSupplier
    {


        public ResourceBundle getResourceBundle(Locale locale) {
            return ResourceBundle.getBundle(BUNDLE_NAME, locale);
        }

    }

}
