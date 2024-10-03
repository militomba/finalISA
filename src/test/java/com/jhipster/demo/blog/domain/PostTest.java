package com.jhipster.demo.blog.domain;

import static org.assertj.core.api.Assertions.assertThat;

import com.jhipster.demo.blog.web.rest.TestUtil;
import java.time.Instant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PostTest {

    //test de unidad
    private Post post;

    @BeforeEach
    void setUp() {
        post = new Post();
    }

    //Test para crear post con datos requeridos
    @Test
    void createPost() {
        post.setTitle("Post de prueba");
        post.setContent("Contenido de prueba");
        post.setDate(Instant.now());

        assertThat(post.getTitle()).isNotNull();
        assertThat(post.getContent()).isNotNull();
        assertThat(post.getDate()).isNotNull();
        System.out.println("Test 'createPost' ejecutado exitosamente");
    }

    //Test para comprobar que falla si no pones los datos requeridos
    @Test
    void postWithoutRequiredFields() {
        Post invalidPost = new Post();

        assertThat(invalidPost.getTitle()).isNull();
        assertThat(invalidPost.getContent()).isNull();
        assertThat(invalidPost.getDate()).isNull();
        System.out.println("Test 'postWithoutRequiredFields' ejecutado exitosamente");
    }

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Post.class);
        Post post1 = new Post();
        post1.setId(1L);
        Post post2 = new Post();
        post2.setId(post1.getId());
        assertThat(post1).isEqualTo(post2);
        post2.setId(2L);
        assertThat(post1).isNotEqualTo(post2);
        post1.setId(null);
        assertThat(post1).isNotEqualTo(post2);
    }
}
