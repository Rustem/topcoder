package tccc04.onlineround4;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BombManTest {

    protected BombMan solution;

    @Before
    public void setUp() {
        solution = new BombMan();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] maze = new String[]{".....B.", ".#####.", ".#...#.", ".#E#.#.", ".###.#.", "......."};
        int bombs = 1;

        int expected = 8;
        int actual = solution.shortestPath(maze, bombs);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] maze = new String[]{"B.#.#.#...E"};
        int bombs = 2;

        int expected = -1;
        int actual = solution.shortestPath(maze, bombs);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] maze = new String[]{"..#####", "B.#####", "..#####", "#######", "####...", "####.E."};
        int bombs = 4;

        int expected = 17;
        int actual = solution.shortestPath(maze, bombs);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] maze = new String[]{".#.#.#.#B#...#.#...#.#...#.#...#.#...#.#.#.......", ".#.#.#.#.#.###.###.#.###.#.#.###.###.#.#.#.###.##", ".#.#.#...#.#.#.#.#.#...#.....#.#.#...#...#.#.#...", ".#.#.###.#.#.#.#.#.###.#.#####.#.###.###.#.#.###.", ".............#.#...#...#.....#.#.#...#.#.#.....#.", "##.#######.###.#.#####.#.#####.#.###.#.#.#.#.####", ".#.#.....#...#...#.#...#...#.#.#...#...#...#.....", ".#######.#.#####.#.#.#.#.###.#.###.#.#####.#.####", ".#.#.#.#...#.#.#.#.#.#.......#...#.#...#.#.#.....", ".#.#.#.###.#.#.#.#.#####.#####.###.###.#.#.######", ".....#...#.#...#...#...#...#...#...#.#.#.........", "####.###.#.###.###.#.###.#.#.###.###.#.#.########", ".......#.........#.#.#.#.#.#.#.#.........#...#...", ".#.###.#########.#.#.#.#.###.#.#####.#.#.#.###.##", ".#.#.........#.#.#.#.#.....#.#.#.....#.#.........", "############.#.#.#.#.#.#####.#.#.################", ".#...........#...#.#.#.#...#.#.#...#.#.#.....#...", ".#####.#####.###.#.#.#.#.###.#.#.###.#.#.#####.##", ".......#...#.#.#.....#...#...#.#.#.#.#...........", "##########.#.#.#####.#.###.###.#.#.#.#.##########", ".....#...#.....#.#...#.......#.#...#.......#.....", "##.#.###.#.###.#.#.#.#.#####.#.#.###.#######.####", "...#...#...#.......#.....#.#...#...#.......#.....", "####.#.#.#########.#.###.#.#####.###.#.#######.##", ".#...#...#.........#.#.....#.........#.#.#.#.....", ".#####.#.#.###.#######.#.###.#.#########.#.#.####", ".......#.#.#...#.......#.....#.#.#.......#.#.#.#.", "########.#.#.#.#####.#.###.#.###.#.#######.#.#.#.", ".........#.#.#.#.....#...#.#.........#.#.........", "################.#.#.#.#.#.#.#.#######.#.########", ".................#.#.#.#.#.#.#...........#.......", "########.#####.#.###.#.#.#####.###.#.#####.###.##", ".........#...#.#...#.#.#...#.....#.#.........#...", ".#####.#####.#.###.#.###.#.#.#.#.#.#####.#.###.#.", ".#.....#.........#.#.#...#.#.#.#.#.#.....#...#.#.", "####.#####.###.#.#.#.#.#.#.###.###.#.#.#.#.#####.", ".....#.....#.#.#.#.#.#.#.#.#...#...#.#.#.#...#...", "####.#.#.###.#.#.###.#.###.#.#.#####.#.#.#.######", ".....#.#.#.#...#...#.#...#.#.#...#...#.#.#.......", "##########.#.#.#.#####.###.#.#.###.#.###.#####.##", "...#.#...#...#.#.....#.#...#.#...#.#.#.......#...", ".#.#.#.#.#.#.#.#.#.#.###.#.#########.###.#.#.#.#.", ".#.#...#...#.#.#.#.#...#.#...#.......#...#.#.#.#.", "##.###.#.#.###.#.#.#.#.#####.#.#.#.###.#.########", ".......#.#...#.#.#.#.#.#.....#.#.#...#.#.........", "####.#######.#.#####.#.###.#.#.###.#.#.#.########", "E..#.......#.#.....#.#.#.#.#.#.#...#.#.#.........", "##.#.#.#.###.###.###.###.#.#.###.#.#.#.#.#######.", ".....#.#...#.#.....#.#.....#...#.#.#.#.#.....#..."};
        int bombs = 3;

        int expected = 76;
        int actual = solution.shortestPath(maze, bombs);

        Assert.assertEquals(expected, actual);
    }

}