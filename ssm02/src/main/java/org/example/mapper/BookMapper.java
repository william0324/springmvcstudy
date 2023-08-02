package org.example.mapper;

import org.example.pojo.Book;

import java.util.List;

public interface BookMapper {
    //@Insert("insert into t_book (type,name,description) values(#{type},#{name},#{description})")
    public void save(Book book);

    //@Update("update t_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    public void update(Book book);

    //@Delete("delete from t_book where id = #{id}")
    public void delete(Integer id);

    //@Select("select * from t_book where id = #{id}")
    public Book getById(Integer id);

    //@Select("select * from t_book")
    public List<Book> getAll();
}
