package Apr30;

// LC223. Rectangle Area
// Rectangle1 + Rectangle2 - Overlap == total area taken up by the 2 rectangles



public class LC223 {



    static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {

        // Rectangle 1 Area
        int r1x = Math.abs(ax1-ax2); int r1y = Math.abs(ay1-ay2);
        int rect1Area = r1x * r1y;

        // Rectangle 2 Area
        int r2x = Math.abs(bx1-bx2); int r2y = Math.abs(by1-by2);
        int rect2Area = r2x* r2y;

        // Overlapping area
        // Find the difference between the left side x coordinates and the right side x coordinates
        // Find the difference between the left side y coordinates and the right side y coordinates

        int odx = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int ody = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        int overlapArea =odx * ody;

        // Rectangle1 + Rectangle2 - Overlap == total area taken up by the 2 rectangles
        return ( (rect1Area+rect2Area) -overlapArea );

    }

    void main(){
        int ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2;
        // expectedOutput: 45
        System.out.println(computeArea(ax1,ay1,ax2,ay2,bx1,by1,bx2,by2));
        int ax3 = -2, ay3 = -2, ax4 = 2, ay4 = 2, bx3 = -2, by3 = -2, bx4 = 2, by4 = 2;
        // expectedOutput: 16
        System.out.println(computeArea(ax3,ay3,ax4,ay4,bx3,by3,bx4,by4));
    }
}
