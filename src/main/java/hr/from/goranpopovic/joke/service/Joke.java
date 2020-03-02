package hr.from.goranpopovic.joke.service;


import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class Joke implements JokeService{

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	
	
	public Joke() {
	
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}



	@Override
	public String getJoke() {
		
		return chuckNorrisQuotes.getRandomQuote();
	}

}
