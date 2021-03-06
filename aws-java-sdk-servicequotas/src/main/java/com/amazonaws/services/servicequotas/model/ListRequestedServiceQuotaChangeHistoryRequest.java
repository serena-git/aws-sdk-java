/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicequotas.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListRequestedServiceQuotaChangeHistory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRequestedServiceQuotaChangeHistoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the service that you want to use.
     * </p>
     */
    private String serviceCode;
    /**
     * <p>
     * Specifies the status value of the quota increase request.
     * </p>
     */
    private String status;
    /**
     * <p>
     * (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request
     * that indicates that there's more output available. In a subsequent call, set it to the value of the previous
     * call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * (Optional) Limits the number of results that you want to include in the response. If you don't include this
     * parameter, the response defaults to a value that's specific to the operation. If additional items exist beyond
     * the specified maximum, the <code>NextToken</code> element is present and has a value (isn't null). Include that
     * value as the <code>NextToken</code> request parameter in the call to the operation to get the next part of the
     * results. You should check <code>NextToken</code> after every operation to ensure that you receive all of the
     * results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Specifies the service that you want to use.
     * </p>
     * 
     * @param serviceCode
     *        Specifies the service that you want to use.
     */

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * Specifies the service that you want to use.
     * </p>
     * 
     * @return Specifies the service that you want to use.
     */

    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * Specifies the service that you want to use.
     * </p>
     * 
     * @param serviceCode
     *        Specifies the service that you want to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRequestedServiceQuotaChangeHistoryRequest withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * Specifies the status value of the quota increase request.
     * </p>
     * 
     * @param status
     *        Specifies the status value of the quota increase request.
     * @see RequestStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the status value of the quota increase request.
     * </p>
     * 
     * @return Specifies the status value of the quota increase request.
     * @see RequestStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies the status value of the quota increase request.
     * </p>
     * 
     * @param status
     *        Specifies the status value of the quota increase request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequestStatus
     */

    public ListRequestedServiceQuotaChangeHistoryRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies the status value of the quota increase request.
     * </p>
     * 
     * @param status
     *        Specifies the status value of the quota increase request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequestStatus
     */

    public ListRequestedServiceQuotaChangeHistoryRequest withStatus(RequestStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request
     * that indicates that there's more output available. In a subsequent call, set it to the value of the previous
     * call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     * 
     * @param nextToken
     *        (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous
     *        request that indicates that there's more output available. In a subsequent call, set it to the value of
     *        the previous call's <code>NextToken</code> response to indicate where the output should continue from.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request
     * that indicates that there's more output available. In a subsequent call, set it to the value of the previous
     * call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     * 
     * @return (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous
     *         request that indicates that there's more output available. In a subsequent call, set it to the value of
     *         the previous call's <code>NextToken</code> response to indicate where the output should continue from.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request
     * that indicates that there's more output available. In a subsequent call, set it to the value of the previous
     * call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     * 
     * @param nextToken
     *        (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous
     *        request that indicates that there's more output available. In a subsequent call, set it to the value of
     *        the previous call's <code>NextToken</code> response to indicate where the output should continue from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRequestedServiceQuotaChangeHistoryRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * (Optional) Limits the number of results that you want to include in the response. If you don't include this
     * parameter, the response defaults to a value that's specific to the operation. If additional items exist beyond
     * the specified maximum, the <code>NextToken</code> element is present and has a value (isn't null). Include that
     * value as the <code>NextToken</code> request parameter in the call to the operation to get the next part of the
     * results. You should check <code>NextToken</code> after every operation to ensure that you receive all of the
     * results.
     * </p>
     * 
     * @param maxResults
     *        (Optional) Limits the number of results that you want to include in the response. If you don't include
     *        this parameter, the response defaults to a value that's specific to the operation. If additional items
     *        exist beyond the specified maximum, the <code>NextToken</code> element is present and has a value (isn't
     *        null). Include that value as the <code>NextToken</code> request parameter in the call to the operation to
     *        get the next part of the results. You should check <code>NextToken</code> after every operation to ensure
     *        that you receive all of the results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * (Optional) Limits the number of results that you want to include in the response. If you don't include this
     * parameter, the response defaults to a value that's specific to the operation. If additional items exist beyond
     * the specified maximum, the <code>NextToken</code> element is present and has a value (isn't null). Include that
     * value as the <code>NextToken</code> request parameter in the call to the operation to get the next part of the
     * results. You should check <code>NextToken</code> after every operation to ensure that you receive all of the
     * results.
     * </p>
     * 
     * @return (Optional) Limits the number of results that you want to include in the response. If you don't include
     *         this parameter, the response defaults to a value that's specific to the operation. If additional items
     *         exist beyond the specified maximum, the <code>NextToken</code> element is present and has a value (isn't
     *         null). Include that value as the <code>NextToken</code> request parameter in the call to the operation to
     *         get the next part of the results. You should check <code>NextToken</code> after every operation to ensure
     *         that you receive all of the results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * (Optional) Limits the number of results that you want to include in the response. If you don't include this
     * parameter, the response defaults to a value that's specific to the operation. If additional items exist beyond
     * the specified maximum, the <code>NextToken</code> element is present and has a value (isn't null). Include that
     * value as the <code>NextToken</code> request parameter in the call to the operation to get the next part of the
     * results. You should check <code>NextToken</code> after every operation to ensure that you receive all of the
     * results.
     * </p>
     * 
     * @param maxResults
     *        (Optional) Limits the number of results that you want to include in the response. If you don't include
     *        this parameter, the response defaults to a value that's specific to the operation. If additional items
     *        exist beyond the specified maximum, the <code>NextToken</code> element is present and has a value (isn't
     *        null). Include that value as the <code>NextToken</code> request parameter in the call to the operation to
     *        get the next part of the results. You should check <code>NextToken</code> after every operation to ensure
     *        that you receive all of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRequestedServiceQuotaChangeHistoryRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getServiceCode() != null)
            sb.append("ServiceCode: ").append(getServiceCode()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRequestedServiceQuotaChangeHistoryRequest == false)
            return false;
        ListRequestedServiceQuotaChangeHistoryRequest other = (ListRequestedServiceQuotaChangeHistoryRequest) obj;
        if (other.getServiceCode() == null ^ this.getServiceCode() == null)
            return false;
        if (other.getServiceCode() != null && other.getServiceCode().equals(this.getServiceCode()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceCode() == null) ? 0 : getServiceCode().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListRequestedServiceQuotaChangeHistoryRequest clone() {
        return (ListRequestedServiceQuotaChangeHistoryRequest) super.clone();
    }

}
