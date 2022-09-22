package com.ivy.problems.PracticeProblems;
import java.util.ArrayList;
public class Movie  {
    private String title; 	private String studio; 	private String rating;
    public Movie(String title, String studio, String rating)
    {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
      }
      public Movie(String title, String studio)
      { 		this.title = title;
          this.studio = studio;
          rating = "PG"; 	}
    public Movie[] getPG(Movie[] movies) 	{
         		Movie[] pg_movies = new Movie[movies.length];
                 		int count = 0;
                         for(Movie movie : movies) 		{
                             if(movie.rating.equals("PG")) 			{
                                 pg_movies[count++] = movie;
                             } 		}
                         return pg_movies; 	}
    public ArrayList<Movie> getPGAL(Movie[] movies) 	{
        ArrayList<Movie> pg_movies = new ArrayList<>();
        for(Movie movie : movies) 		{
            if(movie.rating.equals("PG"))
            {
                pg_movies.add(movie); 			} 		}
        return pg_movies; 	}
    public String toString() 	{ 		return "Title  : "+ title + "\nStudio : " + studio + "\nRating : " + rating + "\n"; 	}
    public static void main(String[] args)  	{
        Movie movie = new Movie("House of Dragon", "HBO", "8.1");
        System.out.println(movie); 	}  }