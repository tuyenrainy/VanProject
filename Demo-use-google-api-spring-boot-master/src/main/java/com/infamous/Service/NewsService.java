package com.infamous.Service;
import com.infamous.Model.NewsModel;
public interface NewsService {
	
	void addNews(NewsModel model);
	
	void deleleNews(String id);
	
	NewsModel findNewsById(String id);
	
	Iterable<NewsModel> getAll();
}
