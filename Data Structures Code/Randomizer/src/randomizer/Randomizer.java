/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomizer;

/**
 *
 * @author Hp
 */
import java.util.Random;

public class Randomizer
{

    int[] arr = new int[10];
    int count = -1;
    Random r = new Random();

    public Randomizer()
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = -1;
        }
    }

    public boolean isFull()
    {
        if (count == arr.length - 1)
        {
            return true;
        }
        return false;
    }

    public boolean isEmpty()
    {
        if (count == -1)
        {
            return true;
        }
        return false;
    }

    public void insert(int value)
    {
        if (value < 0)
        {
            System.out.println("Negative number not allowed");
        } else if (isFull())
        {
            System.out.println("Rondomizer is full");
        } else
        {
            int a = r.nextInt(10);
            if (arr[a] == -1)
            {
                arr[a] = value;
            } else
            {
                while (arr[a] != -1)
                {
                    a = r.nextInt(10);
                }
                arr[a] = value;
            }
            count++;
        }
    }

    public int delete()
    {
        if (isEmpty())
        {
            System.out.println("Randomizer is Empty");
            return -1;
        } else
        {
            int a = r.nextInt(10);
            int temp = 0;
            if (arr[a] > -1)
            {
                temp = arr[a];
                arr[a] = -1;
            } else
            {
                while (arr[a] == -1)
                {
                    a = r.nextInt(10);
                }
                temp = arr[a];
                arr[a] = -1;
            }
            count--;
            return temp;
        }

    }

    public void print()
    {
        System.out.println("Array: \nIndex: Element:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.printf("%5d%9d\n", i, arr[i]);
        }
        System.out.println("-1 indicates that the index is empty");
    }

}
