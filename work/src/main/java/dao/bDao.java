package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import entity.Book;

@Repository
public interface bDao {
	
	@Select("select book.*,type.name typename from book inner join type ON book.typeid=type.id ${txt}")
	public  List<Book> select(@Param("txt") String txt);
}
