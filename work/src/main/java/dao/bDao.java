package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import entity.Book;

public interface bDao {
	
	@Select("select Book.*,type.name typename from Book inner join type on type.id=book.typeid ${txt}")
	public  List<Book> select(@Param("txt") String txt);
	
	@Delete("delete from Book where id = #{id}")
	public void delete(int id);
	
	@Insert("insert into Book(name,sex,typeid) value(#{name},#{sex},#{typeid})")
	public void insert(Book b);
	
	@Update("update Book set name=#{name},sex=#{sex},typeid=#{typeid} where id=#{id}")
	public void update(Book b);
}
