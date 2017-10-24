package com.sdm.delta.qhr.dao;

import java.util.List;
import java.util.Map;

import com.sdm.delta.qhr.model.Patient;
import com.sdm.delta.qhr.model.Quote;

public interface QhrPatientDao {

	boolean isQhrPatientExist(long rxaaid);

	void updateQhrPatient(long rxaaid);

	void createQhrPatient(long rxaaid);

	Quote getQhrQuote();
	
	List<Map<String,?>> home();

	List<Patient> searchQhrPatientViaPhn(String phn);

}
