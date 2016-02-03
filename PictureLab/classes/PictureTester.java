/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
   public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }

  
  public static void testNegate()
  { Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
    }
  
  public static void testGrayscale()
  {Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.grayScale();
    beach.explore();
    }
  /** Method to test mirrorVertical */

  public static void testMirrorVertical()
  {
    Picture catipillar = new Picture("caterpillar.jpg");
    catipillar.explore();
    catipillar.mirrorVertical();
    catipillar.explore();
  }

  
  /**Method to test mirrorVerticalRightToLeft*/ 
  
  public static void testMirrorVerticalRightToLeft()
  { Picture catipillar = new Picture("caterpillar.jpg");
    catipillar.explore();
    catipillar.mirrorVerticalRightToLeft();
    catipillar.explore();
}
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  public static void testCropAndCopy()
{
    
    
    Picture picture2 = new Picture("temple.jpg");
    
    Picture picture1 = new Picture("caterpillar.jpg");
    picture1.explore();
    picture2.cropAndCopy( picture1, 0, 20, 145, 315, 200, 200 );
    picture1.explore();
    picture2.explore();
    
} 
  
  public static void testMirrorArms()
  {
      Picture arm = new Picture("snowman.jpg"); 
      arm.explore(); 
      arm.mirrorArm(); 
      arm.explore(); 
    }
 
    public static void testMirrorGull()
  {
      Picture gull = new Picture("seagull.jpg"); 
      gull.explore(); 
      gull.mirrorArm(); 
      gull.explore();
    }
    
    /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  /** Method to test mirrorHorizontal()*/
  public static void testMirrorHorizontal()
  {
    Picture catipillar = new Picture("caterpillar.jpg");
    catipillar.explore();
    catipillar.mirrorHorizontal();
    catipillar.explore();
    }
    
   /** Method to test mirrorHorizontalBotToTop()*/ 
   
   public static void testMirrorHorizontalBotToTop()
   
{Picture catipillar = new Picture("caterpillar.jpg");
    catipillar.explore();
    catipillar.mirrorHorizontalBotToTop();
    catipillar.explore();
}

         
      
    
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    testKeepOnlyBlue();
    
    //testKeepOnlyGreen();
    testNegate();
    testGrayscale();
    
    
    testCropAndCopy(); 
    //testFixUnderwater();
    testMirrorVertical();
    testMirrorTemple();
    testMirrorArms();
    testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
   // testCopy();
    testMirrorHorizontal();
    testMirrorVerticalRightToLeft();
    testMirrorHorizontalBotToTop();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}