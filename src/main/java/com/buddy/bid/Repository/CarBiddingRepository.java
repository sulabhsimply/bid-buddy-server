package com.buddy.bid.Repository;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.Query;
import org.springframework.data.couchbase.core.query.ViewIndexed;

@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "carbidding")
public interface CarBiddingRepository {
    @Query("#{#n1ql.selectEntity} where #{#n1ql.filter} and carType = $1")
    CarBiddingRepository getCarsByCarType(final String carType);
}
