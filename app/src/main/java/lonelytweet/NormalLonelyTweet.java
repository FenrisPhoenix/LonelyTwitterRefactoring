package lonelytweet;

import java.util.Date;

public class NormalLonelyTweet extends LonelyTweet {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {

		// FIX: Simplified isValid by removing unessecary if-else statement
		return  tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 10;


	}

	@Override
	public String getTweetBody() {
        return tweetBody;
    }
}