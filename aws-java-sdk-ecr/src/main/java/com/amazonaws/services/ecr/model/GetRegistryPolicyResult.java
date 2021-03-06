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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/GetRegistryPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRegistryPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the registry.
     * </p>
     */
    private String registryId;
    /**
     * <p>
     * The JSON text of the permissions policy for a registry.
     * </p>
     */
    private String policyText;

    /**
     * <p>
     * The ID of the registry.
     * </p>
     * 
     * @param registryId
     *        The ID of the registry.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The ID of the registry.
     * </p>
     * 
     * @return The ID of the registry.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The ID of the registry.
     * </p>
     * 
     * @param registryId
     *        The ID of the registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRegistryPolicyResult withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * The JSON text of the permissions policy for a registry.
     * </p>
     * 
     * @param policyText
     *        The JSON text of the permissions policy for a registry.
     */

    public void setPolicyText(String policyText) {
        this.policyText = policyText;
    }

    /**
     * <p>
     * The JSON text of the permissions policy for a registry.
     * </p>
     * 
     * @return The JSON text of the permissions policy for a registry.
     */

    public String getPolicyText() {
        return this.policyText;
    }

    /**
     * <p>
     * The JSON text of the permissions policy for a registry.
     * </p>
     * 
     * @param policyText
     *        The JSON text of the permissions policy for a registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRegistryPolicyResult withPolicyText(String policyText) {
        setPolicyText(policyText);
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
        if (getRegistryId() != null)
            sb.append("RegistryId: ").append(getRegistryId()).append(",");
        if (getPolicyText() != null)
            sb.append("PolicyText: ").append(getPolicyText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRegistryPolicyResult == false)
            return false;
        GetRegistryPolicyResult other = (GetRegistryPolicyResult) obj;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getPolicyText() == null ^ this.getPolicyText() == null)
            return false;
        if (other.getPolicyText() != null && other.getPolicyText().equals(this.getPolicyText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getPolicyText() == null) ? 0 : getPolicyText().hashCode());
        return hashCode;
    }

    @Override
    public GetRegistryPolicyResult clone() {
        try {
            return (GetRegistryPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
