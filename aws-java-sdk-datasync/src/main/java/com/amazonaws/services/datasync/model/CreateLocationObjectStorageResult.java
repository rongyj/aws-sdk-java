/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * CreateLocationObjectStorageResponse
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationObjectStorage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLocationObjectStorageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server location.
     * </p>
     */
    private String locationArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server location.
     * </p>
     * 
     * @param locationArn
     *        The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server
     *        location.
     */

    public void setLocationArn(String locationArn) {
        this.locationArn = locationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server location.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server
     *         location.
     */

    public String getLocationArn() {
        return this.locationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server location.
     * </p>
     * 
     * @param locationArn
     *        The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server
     *        location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationObjectStorageResult withLocationArn(String locationArn) {
        setLocationArn(locationArn);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLocationArn() != null)
            sb.append("LocationArn: ").append(getLocationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLocationObjectStorageResult == false)
            return false;
        CreateLocationObjectStorageResult other = (CreateLocationObjectStorageResult) obj;
        if (other.getLocationArn() == null ^ this.getLocationArn() == null)
            return false;
        if (other.getLocationArn() != null && other.getLocationArn().equals(this.getLocationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocationArn() == null) ? 0 : getLocationArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateLocationObjectStorageResult clone() {
        try {
            return (CreateLocationObjectStorageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
