package com.boots.controller;

import com.boots.entity.Book;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.*;

public class BookControllerTest extends AbstractTest {
    @Override
    @Before
    public void setUp(){
        super.setUp();
    }

    @Test
    public void testGetAllBooks() throws Exception {
        String uri = "/books";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        Book[] bookList = super.mapFromJson(content, Book[].class);
        assertTrue(bookList.length > 0);
        System.out.println(bookList[0].toString());
    }

    @Test
    public void findBookById() throws Exception {
        String uri = "/books/1";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        Book book = super.mapFromJson(content, Book.class);
        assertNotNull(book);
        System.out.println(book.toString());
    }

    @Test
    public void findNullBookById() throws Exception {
        String uri = "/books/99999";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals("", content);
        System.out.println(content);
    }
}