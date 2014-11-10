/**
 * 
 */
/**
 * @author Vulpe Vladimir
 *
 */
package org.wahlzeit.location;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.Sanselan;
import org.apache.sanselan.common.IImageMetadata;
import org.apache.sanselan.common.IImageMetadata.IImageMetadataItem;
import org.apache.sanselan.common.RationalNumber;
import org.apache.sanselan.formats.jpeg.JpegImageMetadata;
import org.apache.sanselan.formats.jpeg.exifRewrite.ExifRewriter;
import org.apache.sanselan.formats.tiff.TiffField;
import org.apache.sanselan.formats.tiff.TiffImageMetadata;
import org.apache.sanselan.formats.tiff.constants.ExifTagConstants;
import org.apache.sanselan.formats.tiff.constants.GPSTagConstants;
import org.apache.sanselan.formats.tiff.constants.TiffDirectoryConstants.ExifDirectoryType.Image;
import org.apache.sanselan.formats.tiff.constants.TiffTagConstants;
import org.apache.sanselan.formats.tiff.constants.TagInfo;
import org.apache.sanselan.formats.tiff.write.TiffOutputDirectory;
import org.apache.sanselan.formats.tiff.write.TiffOutputSet;
import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.Sanselan;

//import org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter;
//import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
//import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;
//import org.apache.commons.imaging.util.IoUtils;

import org.apache.commons.*;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class WriteImgMetadata {

    // This example illustrates how to set the GPS values in JPEG EXIF metadata.
    //
    public void setExifGPSTag(final File jpegImageFile, final File dst) throws IOException,
            ImageReadException, ImageWriteException {
        OutputStream os = null;
        boolean canThrow = false;
        try {
            TiffOutputSet outputSet = null;

            // note that metadata might be null if no metadata is found.
            final IImageMetadata metadata = Sanselan.getMetadata(jpegImageFile);
            final JpegImageMetadata jpegMetadata = (JpegImageMetadata) metadata;
            if (null != jpegMetadata) {
                // note that exif might be null if no Exif metadata is found.
                final TiffImageMetadata exif = jpegMetadata.getExif();

                if (null != exif) {
                    outputSet = exif.getOutputSet();
                }
            }

            if (null == outputSet) {
                outputSet = new TiffOutputSet();
            }

            {
                // Example of how to add/update GPS info to output set.
                final double longitude =  174.744713;
                final double latitude = -36.874388; 

                outputSet.setGPSInDegrees(longitude, latitude);
            }

            os = new FileOutputStream(dst);
            os = new BufferedOutputStream(os);

            new ExifRewriter().updateExifMetadataLossless(jpegImageFile, os,
                    outputSet);
            canThrow = true;
        } finally {
            IOUtils.closeQuietly( os);
        }
    }
    
    public static void main(final String[] args)
			throws com.mapcode.UnknownTerritoryException {

		 File inputFile = new File("C:/Users/VV/Desktop/haka_1.jpg");
		 File outputFile = new File("C:/Users/VV/Desktop/haka_1_new.jpg");
		
		 WriteImgMetadata wim = new WriteImgMetadata();
		
		 try {
		 wim.setExifGPSTag(inputFile, outputFile);
		 } catch (ImageReadException e1) {
		 // TODO Auto-generated catch block
		 e1.printStackTrace();
		 } catch (ImageWriteException e1) {
		 // TODO Auto-generated catch block
		 e1.printStackTrace();
		 } catch (IOException e1) {
		 // TODO Auto-generated catch block
		 e1.printStackTrace();
		 }
	}
}