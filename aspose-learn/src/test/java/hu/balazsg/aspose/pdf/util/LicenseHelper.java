package hu.balazsg.aspose.pdf.util;

import com.aspose.pdf.License;

import java.io.FileInputStream;

public class LicenseHelper {

    private static final String ASPOSE_LICENSE_FILE_NAME = "Aspose.Pdf.lic";
    private static License license = new com.aspose.pdf.License();

    public static void getLicenseFromSrcRoot() {
        FileInputStream licenseFile = null;
        try {
            licenseFile = new FileInputStream(ASPOSE_LICENSE_FILE_NAME);
            license.setLicense(licenseFile);
            licenseFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
