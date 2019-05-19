/*
 * @(#) ReaderFileProperties.java Copyright (c) 2019. Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package core.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReaderFileProperties {

    public Properties loadFile(String fileName) {
        Properties prop = new Properties();
        try {
            InputStream input = new FileInputStream(fileName);
            prop.load(input);
        } catch (
                IOException io) {
            io.printStackTrace();
        }
        return prop;
    }

    public static ReaderFileProperties getInstance() {
        return new ReaderFileProperties();
    }
}
