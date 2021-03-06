package com.faforever.api.data.domain;

import com.yahoo.elide.annotation.Include;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "global_rating_rank_view")
@Include(rootLevel = true, type = "globalRating")
public class GlobalRating extends Rating {
}
