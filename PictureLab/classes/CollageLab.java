
public class CollageLab
{
public static void testCollage()
{
Picture canvas = new Picture("collagePicture4.jpg"); 
    
Picture collage = new Picture("Canvas2.jpg"); 
 
Picture collage2 = new Picture("collagePicture1.jpg"); 
 
 Picture collage3 = new Picture("Canvas3.jpg"); 
 
 Picture collage4 = new Picture("Canvas4.jpg"); 
 
// modification 1 
 collage.mirrorHorizontal(); 
 collage.mirrorVertical(); 

 
 // modification 2 
 collage2.mirrorHorizontal(); 
 collage2.mirrorVertical();
 collage2.mirrorDiagonal();

 
 
 // modification 3 
 collage3.keepOnlyRed(); 

 

 // modification 4 
 collage4.mirrorHorizontalBotToTop();

 
 
//modification 5 
collage3.cropAndCopy(collage,500,735,685,1124,50,10);

collage3.cropAndCopy(collage4,500,735,685,1124,300,10);

collage3.cropAndCopy(canvas, 500,735,685,1124,50,500);

collage3.cropAndCopy(collage2,500,735,685,1124,300,500);

//collage.cropAndCopy(collage2, 0,10, 79, 79, 408, 698 );
collage3.explore(); 
}
public static void main(String[] args)
{
    
    testCollage(); 
    
    

}
}