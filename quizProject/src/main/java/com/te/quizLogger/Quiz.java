package com.te.quizLogger;

import java.util.Date;

import com.te.hibernateORM.QuizQuestions;
import com.te.hibernateORM.Register;
import com.te.hibernateORM.Results;

interface Quiz {
	
	abstract  Register login(String username,String Password);
	
	abstract  Register register(Register register);
	
	abstract QuizQuestions questions(int id);
	
	abstract void results(Results results);
	
	abstract Results getResults(Date date);

}
