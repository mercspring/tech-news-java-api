package com.technews.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;
import com.technews.model.Vote;

@Repository
public interface VoteRepository extends JpaRepository {
    @Query("SELECT count(*) FROM Vote v where v.postId = :id");
    int countVotesByPostId(@Param("id") Integer id);
}
