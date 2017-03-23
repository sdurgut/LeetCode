/**
 * Created by sdurgut on 3/23/17.
 */
public class IslandPerimeter
{
	public static int islandPerimeter(int[][] grid)
	{
		int perimeter = 0;
		for (int rowidx = 0 ; rowidx<grid.length;rowidx++)
		{
			for (int colidx = 0; colidx< grid[rowidx].length;colidx++)
			{
				int top = 0, bottom = 0 ,right = 0,left = 0;
				// calculate top
				if(grid[rowidx][colidx] == 1)
				{
					if (rowidx - 1 >= 0)
					{
						if (grid[rowidx - 1][colidx] == 0) top = 1;
						if (grid[rowidx - 1][colidx] == 1) top = 0;

					} else top = 1;
					// calculate bottom
					if (rowidx + 1 < grid.length)
					{
						if (grid[rowidx + 1][colidx] == 0) bottom = 1;
						if (grid[rowidx + 1][colidx] == 1) bottom = 0;

					} else bottom = 1;

					// calculate right
					if (colidx + 1 < grid[rowidx].length)
					{
						if (grid[rowidx][colidx + 1] == 0) right = 1;
						if (grid[rowidx][colidx + 1] == 1) right = 0;

					} else right = 1;
					// calculate left
					if (colidx - 1 >= 0)
					{
						if (grid[rowidx][colidx - 1] == 0) left = 1;
						if (grid[rowidx][colidx - 1] == 1) left = 0;

					} else left = 1;
				}

				// System.out.println("row = " + rowidx + " col = " + colidx + " " + top + " " + bottom + " " + right + " "+ left);
				perimeter = perimeter + top + bottom + left + right;
			}
		}
		return perimeter;
	}
	public static void main(String [] args)
	{
		int[][] foo = new int[][] { new int[] { 0,1,0,0 }, new int[] { 1,1,1,0},
									new int[] { 0,1,0,0 }, new int[] { 1,1,0,0 },
		};
		System.out.println(islandPerimeter(foo));
	}
}