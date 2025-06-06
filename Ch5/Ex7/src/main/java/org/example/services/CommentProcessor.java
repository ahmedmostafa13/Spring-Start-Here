package org.example.services;

import org.example.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {
    @Autowired
    private CommentRepository commentRepository;

    private Comment comment;

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public void processComment(Comment c){
        System.out.println("processing comment");
    }
    public void validateComment(Comment c){
        System.out.println("validating comment");
    }
}
