package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.Book;

@Repository
public interface book_dao {
	@Select("select book.*,type.name typename from book inner join type on book.typeid=type.id ${txt} ${limit}")
	public List<Book> select(@Param("txt") String txt,@Param("limit") String limit);
	@Select("select count(1) from book ${txt}")
	public int count(@Param("txt") String txt);
	@Select("select * from book where id=#{id}")
	public Book selectByid(int id);
	@Insert("insert into book(name,sex,typeid) values(#{name},#{sex},#{typeid})")
	public void insert(Book b);
	@Update("update book set name=#{name},sex=#{sex},typeid=#{typeid} where id=#{id}")
	public void update(Book b);
	@Delete("delete from book where id=#{id}")
	public void delete(int id);
}
