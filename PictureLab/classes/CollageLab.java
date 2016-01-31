
public class CollageLab
{
public static void testCollage()
{
 Picture collage = new Picture("collagePicture1.jpg"); 
 
 Picture collage2 = new Picture("collagePicture2.jpg"); 
 
// modification 1 
 collage.mirrorHorizontal(); 
 collage.mirrorVertical(); 
 collage.explore();
 // modification 2 
 collage.mirrorHorizontal(); 
 collage.mirrorVertical();
 collage.mirrorDiagonal();
 collage.explore();
 // modification 3 
 collage.keepOnlyRed(); 
 collage.explore();
 // modification 4 
 collage.mirrorHorizontalBotToTop();
 collage.explore();
 
//modification 5 

collage.cropAndCopy(collage2, 0,10, 79, 79, 408, 698 );
collage.explore(); 
}
public static void main(String[] args)
{
    
    testCollage(); 
    
    

}
}